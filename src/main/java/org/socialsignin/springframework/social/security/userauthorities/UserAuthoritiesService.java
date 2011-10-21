/*
 * Copyright 2011 the original author or authors.
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
package org.socialsignin.springframework.social.security.userauthorities;

import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

/**
* A service that provides the granted authorities for a given userId
* Implemented by {@link SimpleUserAuthoritiesService}.
* @author Michael Lavelle 
*/
public interface UserAuthoritiesService {

	public List<GrantedAuthority> getAuthoritiesForUser(Set<String> providerIds,String userId);
	public GrantedAuthority getProviderAuthority(String providerId);

}
