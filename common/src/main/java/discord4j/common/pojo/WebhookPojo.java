/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.common.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.common.jackson.OptionalField;

import java.util.Optional;

public class WebhookPojo {

	private String id;
	@JsonProperty("guild_id")
	private OptionalField<String> guildId;
	@JsonProperty("channel_id")
	private String channelId;
	private OptionalField<UserPojo> user;
	private Optional<String> name;
	private Optional<String> avatar;
	private String token;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OptionalField<String> getGuildId() {
		return guildId;
	}

	public void setGuildId(OptionalField<String> guildId) {
		this.guildId = guildId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public OptionalField<UserPojo> getUser() {
		return user;
	}

	public void setUser(OptionalField<UserPojo> user) {
		this.user = user;
	}

	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

	public Optional<String> getAvatar() {
		return avatar;
	}

	public void setAvatar(Optional<String> avatar) {
		this.avatar = avatar;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
