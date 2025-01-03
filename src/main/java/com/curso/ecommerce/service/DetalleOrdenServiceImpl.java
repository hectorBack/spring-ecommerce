package com.curso.ecommerce.service;

import com.curso.ecommerce.model.DetalleOrden;
import com.curso.ecommerce.repository.IDetalleOrdenRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {

    private IDetalleOrdenRepository detalleOrdenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden) ;
    }
}
