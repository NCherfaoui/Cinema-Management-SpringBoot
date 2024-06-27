package com.nc.springboot.controller;

import com.nc.springboot.model.Acteur;
import com.nc.springboot.service.ActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

// L'annotation @Controller est utilisée pour indiquer que la classe est un contrôleur Spring MVC.
@Controller
public class ActeurViewController {

    // L'annotation @Autowired est utilisée pour l'injection de dépendances.
    // Ici, elle injecte une instance de ActeurService.
    @Autowired
    private ActeurService acteurService;

    public ActeurViewController(ActeurService acteurService) {
        this.acteurService = acteurService;
    }

    // Cette méthode est utilisée pour afficher la liste des acteurs.
    // L'annotation @RequestMapping est utilisée pour mapper les requêtes HTTP GET sur cette méthode.
    @RequestMapping("/acteurs")
    // Cette méthode est utilisée pour obtenir tous les acteurs et les afficher dans une vue.
    // L'annotation @GetMapping est utilisée pour mapper les requêtes HTTP GET sur cette méthode.
    @GetMapping("/acteurs")
    public String getAllActeurs(Model model) {
        // Récupération de tous les acteurs à l'aide du service.
        List<Acteur> acteurs = acteurService.getAllActeurs();

        // Ajout de la liste des acteurs au modèle.
        // Le modèle est un objet qui transporte des données entre le contrôleur et la vue.
        model.addAttribute("acteurs", acteurs);

        // Retour du nom de la vue (fichier acteurs.html dans le dossier templates).
        return "acteurs";
    }

    // Cette méthode est utilisée pour afficher un formulaire pour ajouter un nouvel acteur.
    // L'annotation @GetMapping est utilisée pour mapper les requêtes HTTP GET sur cette méthode.
    @GetMapping("/acteurs/add")
    public String showAddActeurForm(Model model) {
        // Ajout d'une nouvelle variable au modèle qui contient un nouvel acteur.
        model.addAttribute("acteur", new Acteur());

        // Retour du nom de la vue (fichier add-acteur.html dans le dossier templates).
        return "add-acteur";
    }


    // Cette méthode est utilisée pour ajouter un nouvel acteur.
    // L'annotation @GetMapping est utilisée pour mapper les requêtes HTTP POST sur cette méthode.
    @PostMapping("/acteurs/add")
    public String addActeur(Acteur acteur) {
        // Ajout du nouvel acteur à l'aide du service.
        acteurService.addActeur(acteur);
        // Redirection vers la page des acteurs.
        return "redirect:/acteurs";
    }

    // Modifier un acteur - Afficher le formulaire de modification
    @GetMapping("/acteurs/{id}/edit")
    public String showEditActeurForm(@PathVariable Long id, Model model) {
        // Récupération de l'acteur à modifier à l'aide de son identifiant.
        Acteur acteur = acteurService.getActeurById(id);

        // Ajout de l'acteur au modèle.
        model.addAttribute("acteur", acteur);

        // Retour du nom de la vue (fichier edit-acteur.html dans le dossier templates).
        return "edit-acteur";
    }

    // Modifier un acteur - Mettre à jour l'acteur dans la base de données
    /*@PostMapping("/acteurs/{id}/update")*/
    @PostMapping("/acteurs/update")
    // Id est passé en Post et non en Get pour des raisons de sécurités performances.
    public String updateActeur(Acteur acteur ) {

        // Mise à jour de l'acteur à l'aide du service.
        acteurService.updateActeur(acteur);
        // Redirection vers la page des acteurs.
        return "redirect:/acteurs";
    }

    // Vous pouvez ajouter d'autres méthodes pour gérer les opérations CRUD (Create, Read, Update, Delete) sur les acteurs.
    // Par exemple, pour afficher un acteur spécifique, mettre à jour un acteur ou supprimer un acteur.
    // Vous pouvez également ajouter des méthodes pour gérer d'autres entités et opérations.

}

