package dev.uevo.CadastroDeNinjas.Ninjas.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.uevo.CadastroDeNinjas.Ninjas.model.NinjaModel;
import dev.uevo.CadastroDeNinjas.Ninjas.repository.NinjaRepository;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> getAllNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel getNinjaById(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }

    public NinjaModel createNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    public NinjaModel removeNinja(Long id) {
        NinjaModel ninja = getNinjaById(id);
        if (ninja != null) {
            ninjaRepository.delete(ninja);
        }
        return ninja;
    }
}
