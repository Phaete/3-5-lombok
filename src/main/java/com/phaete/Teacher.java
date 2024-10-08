package com.phaete;

import lombok.Builder;
import lombok.With;

@Builder
public record Teacher(
        String id,
        String name,
        @With
        String subject
) {
}
