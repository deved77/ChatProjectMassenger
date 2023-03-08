package com.messenger.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserLightDto implements Serializable {
    private static final long serialVersionUID = 3476031059344438414L;

    private String username;


}
