package com.asergejs.backend_playground.validation;

import com.asergejs.backend_playground.domain.model.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidationStatus {
    private boolean isValid;
    private Message message;

    public ValidationStatus(boolean isValid) {
        this.isValid = isValid;
    }
}
