package rw.fiat.ne.binarysupermarket.services;

import rw.fiat.ne.binarysupermarket.dtos.NewProductQuantityDTO;
import rw.fiat.ne.binarysupermarket.models.ProductQuantity;

public interface IProductQuantityService {

    Integer byProduct(String productCode);

    ProductQuantity newQuantity(NewProductQuantityDTO dto);
}
