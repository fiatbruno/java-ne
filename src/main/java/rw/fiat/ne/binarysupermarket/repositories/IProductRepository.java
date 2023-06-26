package rw.fiat.ne.binarysupermarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.fiat.ne.binarysupermarket.models.Product;

public interface IProductRepository extends JpaRepository<Product,String> {
}
