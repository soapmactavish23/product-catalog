package com.algaworks.algashop.product.catalog.application.product.event;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductAddedIntegrationEvent {
	private UUID productId;
	@Builder.Default
	private OffsetDateTime addedAt = OffsetDateTime.now();
}