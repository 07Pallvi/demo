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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "ondc_user_transactions")
public class OndcUserTransaction  {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "transaction_id")
	private String transactionId;

	@Column(name = "submission_id")
	private String submissionId;

	@Column(name = "form_response_status")
	private String formResponseStatus;

	@Column(name = "transaction_order")
	private int transactionOrder;

	@OneToOne
	@JoinColumn(name = "status_master_id")
	private StatusMaster statusMaster;

	@OneToOne
	@JoinColumn(name = "bank_master_id")
	private BankMaster bankMaster;

	@OneToOne
	@JoinColumn(name = "ondc_workflow_master_id")
	private OndcWorkflowMaster ondcWorkflowMaster;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

}
