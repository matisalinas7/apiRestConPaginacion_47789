package com.utn.apiRestConPaginacion.services;

import com.utn.apiRestConPaginacion.entities.Autor;
import com.utn.apiRestConPaginacion.repositories.AutorRepository;
import com.utn.apiRestConPaginacion.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}
