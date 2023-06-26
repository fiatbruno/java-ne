package rw.fiat.ne.binarysupermarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.fiat.ne.binarysupermarket.models.Product;
import rw.fiat.ne.binarysupermarket.models.ProductQuantity;

import java.util.List;
import java.util.UUID;

public interface IProductQuantityRepository extends JpaRepository<ProductQuantity, UUID> {

    List<ProductQuantity> findByProduct(Product product);
}
