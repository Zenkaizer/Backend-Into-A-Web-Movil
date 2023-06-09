package com.example.practica3.services;

import com.example.practica3.entities.Reserve;
import com.example.practica3.repositories.IBaseRepository;
import com.example.practica3.repositories.IReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveService extends BaseService<Reserve, Integer> implements IReserveService{

    @Autowired
    private IReserveRepository reserveRepository;

    public ReserveService(IBaseRepository<Reserve, Integer> baseRepository) {
        super(baseRepository);
    }
}
