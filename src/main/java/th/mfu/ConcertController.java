package th.mfu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConcertController {
    // TODO: create hashmap of concerts for storing data
    private HashMap<Integer, Concert>ConcertMap = new HashMap<>();
    // TODO: add initbinder to convert date
    private int nextId = 1;

    @InitBinder
public void initBinder(WebDataBinder binder) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
}
    @GetMapping("/concerts")
    public String listConcerts(Model model) {
        // TODO: add concerts to model
        List<Concert> concert = new ArrayList<>(ConcertMap.values());
        model.addAttribute("concerts", concert);
        // TODO: return a template to list concerts
        return "list-concert-template";
    }

    @GetMapping("/add-concert")
    public String addAConcertForm(Model model) {
        // TODO: pass blank concert to a form
        Concert concert = new Concert();
        model.addAttribute("concert, concert");
        // TODO: return a template for concert form
        return "concert-form-template";
    }

    @PostMapping("/concerts")
    public String saveConcert(@ModelAttribute Concert concert) {
        // TODO: add concert to list of concerts
        int id = nextId++;
        // TODO: increment nextId
        concert.setid(id);
        ConcertMap.put(id,concert);
        // TODO: redirect to list concerts
        return "redirect:/concerts";
    }

    @GetMapping("/delete-concert/{id}")
    public String deleteConcert(@PathVariable int id) {
        // TODO: remove concert from list of concerts
        ConcertMap.remove(id);
        // TODO: redirect to list concerts
        return "redirect:/concerts";
    }

    
    @GetMapping("/delete-concert")
    public String removeAllConcerts() {
        //TODO: clear all employees and reset id
        ConcertMap.clear();
        nextId = 1;
        // TODO: redirect to list concerts
        return "redirect:/concerts";
    }

}
