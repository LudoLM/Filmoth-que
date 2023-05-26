package fr.eni.movielibrary.controller;

import fr.eni.movielibrary.bo.AppUser;
import fr.eni.movielibrary.bo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@SessionAttributes({"loggedUser"})
public class UserController {

    @GetMapping("/login")
    public String login(Model model) {

        Member member = new Member();

        model.addAttribute("user", member);

        return "redirect:/show-movies";
    }

    @GetMapping("/logged-user")
    public String showLoggedUser(Model model) {

        AppUser loggedUser = (AppUser) model.getAttribute("loggedUser");

        // Si je suis deconnecté(e) (donc AppUser est Null)
        if (loggedUser != null) {
            return "redirect:/login";
        }
        // Je suis connecté(e)
        else {
            return "redirect:/show-movies";
        }

    }

    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus) {

        // Vide la session
        sessionStatus.setComplete();

        return "redirect:/login";
    }

    @PostMapping("appUser")
    public String PersonSubmit(@ModelAttribute Member member, Model model) {

        model.addAttribute("loggedUser", member);

        return "redirect:/";
    }
}