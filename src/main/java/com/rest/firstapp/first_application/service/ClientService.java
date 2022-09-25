package com.rest.firstapp.first_application.service;

import com.rest.firstapp.first_application.model.Client;

import java.util.List;

public interface ClientService {

    /**
     * Create a new client
     * @param client - object to create
     */
    void create(Client client);

    /**
     * Return current clients list
     * @return - list of clients
     */
    List<Client> readAll();

    /**
     * Return the client by ID
     * @param id - client's ID
     * @return - clint's object with given ID
     */
    Client read(int id);

    /**
     * Updates client info if needed
     * @param client - certain client for update
     * @param id - certain client's ID
     * @return - true if updated, false if otherwise
     */
    boolean update(Client client, int id);

    /**
     * Delete client by ID
     * @param id - client's ID to delete
     * @return - true if deleted, false if otherwise
     */
    boolean delete(int id);
}
