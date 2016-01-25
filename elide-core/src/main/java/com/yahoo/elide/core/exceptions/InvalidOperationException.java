/*
 * Copyright 2015, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.core.exceptions;

import com.yahoo.elide.core.HttpStatus;

/**
 * Exception representing invalid operations on entities or collections.
 */
public class InvalidOperationException extends HttpStatusException {
    private static final long serialVersionUID = 1L;

    public InvalidOperationException(String body) {
        super("Invalid operation: '" + body + "'");
    }

    @Override
    public int getStatus() {
        return HttpStatus.SC_BAD_REQUEST;
    }
}
