/*
 * Copyright 2015-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * Server that provides game interaction in a multiplayer game.
 */
public class GameServer extends Intangible {
  /**
   * Status of a game server.
   */
  @JsonIgnore public GameServerStatus getServerStatus() {
    return (GameServerStatus) getValue("serverStatus");
  }
  /**
   * Status of a game server.
   */
  @JsonIgnore public Collection<GameServerStatus> getServerStatuss() {
    final Object current = myData.get("serverStatus");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GameServerStatus>) current;
    }
    return Arrays.asList((GameServerStatus) current);
  }
  /**
   * Number of players on the server.
   */
  @JsonIgnore public Integer getPlayersOnline() {
    return (Integer) getValue("playersOnline");
  }
  /**
   * Number of players on the server.
   */
  @JsonIgnore public Collection<Integer> getPlayersOnlines() {
    final Object current = myData.get("playersOnline");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * Video game which is played on this server.
   */
  @JsonIgnore public VideoGame getGame() {
    return (VideoGame) getValue("game");
  }
  /**
   * Video game which is played on this server.
   */
  @JsonIgnore public Collection<VideoGame> getGames() {
    final Object current = myData.get("game");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<VideoGame>) current;
    }
    return Arrays.asList((VideoGame) current);
  }
  protected GameServer(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link GameServer}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public GameServer build() {
      return new GameServer(myData);
    }
    /**
     * Status of a game server.
     */
    @NotNull public Builder serverStatus(@NotNull GameServerStatus gameServerStatus) {
      putValue("serverStatus", gameServerStatus);
      return this;
    }
    /**
     * Number of players on the server.
     */
    @NotNull public Builder playersOnline(@NotNull Integer integer) {
      putValue("playersOnline", integer);
      return this;
    }
    /**
     * Video game which is played on this server.
     */
    @NotNull public Builder game(@NotNull VideoGame videoGame) {
      putValue("game", videoGame);
      return this;
    }
    /**
     * Video game which is played on this server.
     */
    @NotNull public Builder game(@NotNull VideoGame.Builder videoGame) {
      putValue("game", videoGame.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("serverStatus".equals(key) && value instanceof GameServerStatus) { serverStatus((GameServerStatus)value); return; }
      if ("serverStatuss".equals(key) && value instanceof GameServerStatus) { serverStatus((GameServerStatus)value); return; }
      if ("playersOnline".equals(key) && value instanceof Integer) { playersOnline((Integer)value); return; }
      if ("playersOnlines".equals(key) && value instanceof Integer) { playersOnline((Integer)value); return; }
      if ("game".equals(key) && value instanceof VideoGame) { game((VideoGame)value); return; }
      if ("games".equals(key) && value instanceof VideoGame) { game((VideoGame)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
