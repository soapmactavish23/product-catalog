package com.algaworks.algashop.product.catalog.application.product.query;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ImageInput {
    @NotBlank
    private String remoteFileName;
}
