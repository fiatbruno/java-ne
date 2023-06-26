package rw.fiat.ne.binarysupermarket.services;

import rw.fiat.ne.binarysupermarket.dtos.CreateOrUpdateProductDTO;
import rw.fiat.ne.binarysupermarket.models.Product;

import java.util.List;

public interface IProductService {

    Product findByCode(String code);

    List<Product> all();

    Product register(CreateOrUpdateProductDTO dto);
}
