package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP",discriminatorType = DiscriminatorType.STRING,length=1)
public abstract class Operation implements Serializable {
	 @Id @GeneratedValue
	private Long numero;
	private Date deteOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="CDE_CPTE")
	
	private Compte compte;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(Date deteOperation, double montant, Compte compte) {
		super();
		this.deteOperation = deteOperation;
		this.montant = montant;
		this.compte = compte;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDeteOperation() {
		return deteOperation;
	}
	public void setDeteOperation(Date deteOperation) {
		this.deteOperation = deteOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
