package com.messenger.utils;

import java.io.Serializable;

public enum Command implements Serializable {
    MESSAGE,
    REGISTER,
    LOGIN,
    BLOCK,
    SERVER_RESPONSE,
    SERVER
}
