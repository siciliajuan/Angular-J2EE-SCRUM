/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public interface DAOInterface<T> {
	public T create(T object);
	public T getById(int id);
	public ArrayList<T> getAll();
	public T update(T object);
	public boolean remove(int id);
}
