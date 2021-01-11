package com.codingdojo.dojoninja.services;

import com.codingdojo.dojoninja.models.Ninja;
import com.codingdojo.dojoninja.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository=ninjaRepository;
    }
    public Ninja findNinja(Long id){
        Optional<Ninja> optionalninja=ninjaRepository.findById(id);
        if (optionalninja.isPresent()){
            return optionalninja.get();
        }
        return null;
    }
    public List<Ninja> allNinja(){
        return ninjaRepository.findAll();
    }
    public Ninja createNinja(Ninja ninja){
        return ninjaRepository.save(ninja);

    }
}
