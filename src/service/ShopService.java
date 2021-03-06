package service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Properties;

import db.DbException;
import db.PersonDb;
import db.PersonDbSql;
import db.ProductDb;
import db.ProductDbSql;
import domain.Person;
import domain.Product;

public class ShopService {
	private PersonDb personDb;
	private ProductDb productDb;

	public ShopService(Properties properties) {
		personDb = new PersonDbSql(properties);
		productDb = new ProductDbSql(properties);
	}

	public Person getPerson(String personId) {
		return getPersonDb().get(personId);
	}

	public List<Person> getPersons() {
		return getPersonDb().getAll();
	}

	public List<Person> getPersonsByLastname() {
		return getPersonDb().getAllByLastname();
	}

	public void addPerson(Person person) throws DbException {
		getPersonDb().add(person);
	}

	public void updatePersons(Person person) {
		getPersonDb().update(person);
	}

	public void deletePerson(String id) {
		getPersonDb().delete(id);
	}

	private PersonDb getPersonDb() {
		return personDb;
	}

	public Product getProduct(int productId) {
		return getProductDb().get(productId);
	}

	public List<Product> getProducts() {
		return getProductDb().getAll();
	}

	public void addProduct(Product product) throws DbException {
		getProductDb().add(product);
	}

	public void updateProduct(Product product) {
		getProductDb().update(product);
	}

	public void deleteProduct(int id) {
		getProductDb().delete(id);
	}

	private ProductDb getProductDb() {
		return productDb;
	}

	public Person getUserIfAuthenticated(String userid, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		for (Person person : getPersons()) {
			if (person.getUserid().toLowerCase().equals(userid.toLowerCase()) && person.isCorrectPassword(password)) {
				return person;
			}
		}
		return null;
	}
}
