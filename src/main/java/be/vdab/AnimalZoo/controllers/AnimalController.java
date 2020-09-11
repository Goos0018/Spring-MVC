package be.vdab.AnimalZoo.controllers;

import be.vdab.AnimalZoo.model.Animal;
import be.vdab.AnimalZoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @RequestMapping(value = "/getAllAnimals", method = RequestMethod.GET)
    public ModelAndView getAllEmployees(ModelMap model) {
        model.addAttribute("animals", animalService.getAllAnimals());

        return new ModelAndView("AnimalList", model);
    }

    @RequestMapping(value="/AnimalList", method= RequestMethod.GET)
    public ModelAndView listAnimals(ModelMap model){
        model.addAttribute("animals", animalService.getAllAnimals());

        return new ModelAndView("AnimalList", model);
    }

    @RequestMapping(value="/addAnimal",method=RequestMethod.GET)
    public ModelAndView showAddView(ModelMap model){
        return new ModelAndView("addAnimal",model);
    }

    @RequestMapping(value="/addAnimal",method=RequestMethod.POST)
    public  ModelAndView addAnimal(@ModelAttribute Animal animal, ModelMap model){
        animalService.addAnimal(animal);
        return new ModelAndView("redirect:/Animal/AnimalList");
    }

    @RequestMapping(value="/{name}/deleteAnimal",method=RequestMethod.GET)
    public ModelAndView deleteAnimal(@PathVariable("name") String name, ModelMap model){
        animalService.deleteAnimalByName(name);
        return new ModelAndView("redirect:/Animal/AnimalList");
    }

  /*  @RequestMapping(value="/{name}/editAnimal",method=RequestMethod.GET)
    public ModelAndView showEditAnimal(@PathVariable("name") String name, ModelMap model){
        model.addAttribute("animalFromList", m_ManagerAnimal.getAnimalByName(name) );
        return new ModelAndView("editAnimal",model);
    }
  */

  /*  @RequestMapping(value="/{name}/editAnimal",method=RequestMethod.POST)
    public  ModelAndView editAnimal(@PathVariable("name") String name,@ModelAttribute Animal animal, ModelMap model){
        Animal firstAnimal = m_ManagerAnimal.getAnimalByName(name);
        //update firstAnimal
        firstAnimal.setName(animal.getName());
        firstAnimal.setSpecies(animal.getSpecies());
        firstAnimal.setFoodType(animal.getFoodType());
        firstAnimal.setLastEaten(animal.getLastEaten());

        return new ModelAndView("redirect:/Animal/listAnimals");
    }
*/


}

