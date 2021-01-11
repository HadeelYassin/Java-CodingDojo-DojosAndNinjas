package com.codingdojo.dojoninja.services;


import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;
    public DojoService(DojoRepository dojoRepository){
        this.dojoRepository=dojoRepository;
    }
public Dojo findDojo(Long id){
    Optional<Dojo> optionaldojo=dojoRepository.findById(id);
    if (optionaldojo.isPresent()){
        return optionaldojo.get();
    }
    return null;
}
public List<Dojo> allDojo(){
        return dojoRepository.findAll();
}
public Dojo createDojo(Dojo dojo){
        return dojoRepository.save(dojo);

}

}
