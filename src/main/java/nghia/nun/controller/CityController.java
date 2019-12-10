package nghia.nun.controller;


import nghia.nun.model.city;
import nghia.nun.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

//    @ModelAttribute("city")

    @GetMapping("/list-city")
    public ModelAndView listCity(){
        Iterable<city> city=cityService.findAll();
        ModelAndView modelAndView=new ModelAndView("city/list");
        modelAndView.addObject("citys",city);
        return modelAndView;
    }

    @GetMapping("/create-city")
    public ModelAndView createCity(){
        ModelAndView modelAndView=new ModelAndView("/city/create");
        modelAndView.addObject("citys",new city());
        return modelAndView;
    }

    @PostMapping("/create-city")
    public ModelAndView saveCity(@ModelAttribute("citys")city city){
        cityService.save(city);

        ModelAndView modelAndView = new ModelAndView("/city/create");
        modelAndView.addObject("citys", new city());
        modelAndView.addObject("message","New city created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-city/{id}")
    public ModelAndView editCity(@PathVariable Long id){
        city city=cityService.findById(id);
        ModelAndView modelAndView =new ModelAndView("city/edit");
        modelAndView.addObject("citys",city);
        return modelAndView;
    }

    @PostMapping("/update-city")
    public ModelAndView updateCity(@ModelAttribute("citys") city city){
        cityService.save(city);

        ModelAndView modelAndView = new ModelAndView("redirect:/list-city");
        modelAndView.addObject("citys",city);
        modelAndView.addObject("message", "City updated successfully");
        return modelAndView;
    }

@GetMapping("/delete-city/{id}")
    public ModelAndView deleteCity(@PathVariable Long id){
        city city=cityService.findById(id);
        if (city != null){
            ModelAndView modelAndView=new ModelAndView("/city/delete");
            modelAndView.addObject("citys",city);
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("/error.404");
            return modelAndView;
        }
}

@PostMapping("/delete-city")
    public String deleteCity(@ModelAttribute("citys") city city){
        cityService.remove(city.getCity_id());
        return "redirect:/list-city";
}
}
