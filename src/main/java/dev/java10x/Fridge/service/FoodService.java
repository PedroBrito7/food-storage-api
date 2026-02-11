package dev.java10x.Fridge.service;

import dev.java10x.Fridge.Repository.FoodRepository;
import dev.java10x.Fridge.controller.FoodController;
import dev.java10x.Fridge.model.Food;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }
    // LISTAR
    public List<Food> getAll(){return foodRepository.findAll();}
    // SALVAR
    public Food save(Food food){return foodRepository.save(food);}
    // DELETE
    public void delete(Long id){foodRepository.deleteById(id);    }



}
