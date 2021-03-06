/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.integration.eap.maven.exception;

/**
 * Exception for an invalid definition for a single static module.
 */
public class EAPModuleDefinitionException extends Exception {

    /** The module name. **/
    private String moduleName;

    public EAPModuleDefinitionException(String moduleName, String message) {
        super(message);
        this.moduleName = moduleName;
    }

    public EAPModuleDefinitionException(String moduleName, String message, Throwable cause) {
        super(message, cause);
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    @Override
    public String getMessage() {
        String parentMessage = super.getMessage();
        return new StringBuilder(parentMessage).append(" - [Module: ").append(moduleName).append("]").toString();
    }
}
