package rw.fiat.ne.binarysupermarket.services;

import rw.fiat.ne.binarysupermarket.models.User;


public interface IUserService {

    User create(User user);

    boolean isNotUnique(User user);

    void validateNewRegistration(User user);

    User getLoggedInUser();

}