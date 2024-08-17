package com.example.entity;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "child_item")
public class ChildItem  {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "parent_item_id")
	private String parentItemId;

	@Column(name = "child_item_id")
	private String childItemId;

	@Column(name = "min_interest_rate")
	private Double minInterestRate;

	@Column(name = "max_interest_rate")
	private Double maxInterestRate;

	@Column(name = "min_tenure")
	private Integer minTenure;

	@Column(name = "max_tenure")
	private Integer maxTenure;

	@Column(name = "min_loan_amount")
	private Double minLoanAmount;

	@Column(name = "max_loan_amount")
	private Double maxLoanAmount;

	@OneToOne
	@JoinColumn(name = "form_id", referencedColumnName = "form_id")
	private Form form;

	@ManyToOne
	@JoinColumn(name = "bank_master_id", referencedColumnName = "id")
	private BankMaster bankMaster;

	@Column(name = "paymentTagsJson", columnDefinition = "TEXT")
	private String paymentTagsJson;

	@Column(name = "bankContactInfo", columnDefinition = "TEXT")
	private String bankContactInfo;

}
