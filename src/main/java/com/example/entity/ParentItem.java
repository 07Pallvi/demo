package com.example.entity;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "parent_item")
public class ParentItem  {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "parent_item_id")
	private String parentItemId;

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
	private transient Form form;

	@Column(name = "payment_tags_json", columnDefinition = "TEXT")
	private String paymentTagsJson;

	@Column(name = "bank_contact_info", columnDefinition = "TEXT")
	private String bankContactInfo;

}
