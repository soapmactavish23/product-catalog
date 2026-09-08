package com.algaworks.algashop.product.catalog.application.product.event;

import com.algaworks.algashop.product.catalog.application.IntegrationEvent;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductAddedIntegrationEvent implements IntegrationEvent {
	private UUID productId;
	@Builder.Default
	private OffsetDateTime addedAt = OffsetDateTime.now();

	@Override
	public String getAggregateId() {
		if(productId == null) {
			return null;
		}
		return productId.toString();
	}
}