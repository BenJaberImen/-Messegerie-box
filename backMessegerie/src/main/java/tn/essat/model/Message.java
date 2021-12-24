package tn.essat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity
public class Message implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String sujet;

	@ManyToOne @JoinColumn(name="user_send_id")
	private Utilisateur user_send;
	@ManyToOne @JoinColumn(name="user_receive_id")
	private Utilisateur user_receive;
	public Message(Integer id, String sujet, Utilisateur user_send, Utilisateur user_receive) {
		super();
		this.id = id;
		this.sujet = sujet;
		this.user_send = user_send;
		this.user_receive = user_receive;
	}
	public Message() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public Utilisateur getUser_send() {
		return user_send;
	}
	public void setUser_send(Utilisateur user_send) {
		this.user_send = user_send;
	}
	public Utilisateur getUser_receive() {
		return user_receive;
	}
	public void setUser_receive(Utilisateur user_receive) {
		this.user_receive = user_receive;
	}


}
