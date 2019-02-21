/*package edu.uark.models.entities;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.dataaccess.repository.DatabaseTable;
import edu.uark.models.api.Product;
import edu.uark.models.entities.fieldnames.ProductFieldNames;
import org.apache.commons.lang3.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class EmployeeEntity extends BaseEntity<EmployeeEntity> {
	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException {
		this.lookupCode = rs.getString(ProductFieldNames.LOOKUP_CODE);
		this.count = rs.getInt(ProductFieldNames.COUNT);
	}

	@Override
	protected Map<String, Object> fillRecord(Map<String, Object> record) {
		record.put(ProductFieldNames.LOOKUP_CODE, this.lookupCode);
		record.put(ProductFieldNames.COUNT, this.count);

		return record;
	}

	private String lookupCode;
	public String getLookupCode() {
		return this.lookupCode;
	}
	public EmployeeEntity setLookupCode(String lookupCode) {
		if (!StringUtils.equals(this.lookupCode, lookupCode)) {
			this.lookupCode = lookupCode;
			this.propertyChanged(ProductFieldNames.LOOKUP_CODE);
		}

		return this;
	}

	private int count;
	public int getCount() {
		return this.count;
	}
	public EmployeeEntity setCount(int count) {
		if (this.count != count) {
			this.count = count;
			this.propertyChanged(ProductFieldNames.COUNT);
		}

		return this;
	}

	public Product synchronize(Product apiProduct) {
		this.setCount(apiProduct.getCount());
		this.setLookupCode(apiProduct.getLookupCode());

		apiProduct.setId(this.getId());
		apiProduct.setCreatedOn(this.getCreatedOn());

		return apiProduct;
	}

	public EmployeeEntity() {
		super(DatabaseTable.PRODUCT);

		this.count = -1;
		this.lookupCode = StringUtils.EMPTY;
	}

	public EmployeeEntity(Product apiProduct) {
		super(DatabaseTable.PRODUCT);
		
		this.count = apiProduct.getCount();
		this.lookupCode = apiProduct.getLookupCode();
	}
}
*/ // Commenting out until there is a working interface