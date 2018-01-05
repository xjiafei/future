/*
 * Copyright 2012 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.winterframework.efamily.base.restful;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.ServletWebRequest;

import com.winterframework.efamily.base.model.Response;
import com.winterframework.spring.web.servlet.handler.RestError;
 

/**
 * A {@code RestErrorResolver} resolves an exception and produces a {@link RestError} instance that can be used
 * to render a Rest error representation to the response body.
 *
 * @author Les Hazlewood
 */
public interface RestErrorResolver {

    /**
     * Returns a {@code RestError} instance to render as the response body based on the given exception.
     *
     * @param request current {@link ServletWebRequest} that can be used to obtain the source request/response pair.
     * @param handler the executed handler, or <code>null</code> if none chosen at the time of the exception
     *                (for example, if multipart resolution failed)
     * @param ex      the exception that was thrown during handler execution
     * @return a resolved {@code RestError} instance to render as the response body or <code>null</code> for default
     *         processing
     */
	Response resolveError(HttpServletRequest request, Object handler, Exception ex);
}
