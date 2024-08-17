package com.example.entity;


import java.util.Set;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "bank_master")
public class BankMaster  {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "category_id")
	private String categoryId;

	@Column(name = "category_code")
	private String categoryCode;

	@Column(name = "provider_id")
	private String providerId;

	@Column(name = "bpp_id")
	private String bppId;

	@Column(name = "bpp_uri")
	private String bppUri;

	@Column(name = "bank_logo_url")
	private String bankLogoUrl;

	@Column(name = "is_active")
	private Boolean isActive;

	@OneToOne
	@JoinColumn(name = "parent_item_id")
	private ParentItem parentItem;

	@OneToMany(mappedBy = "bankMaster")
	private Set<ChildItem> childItems;

}
