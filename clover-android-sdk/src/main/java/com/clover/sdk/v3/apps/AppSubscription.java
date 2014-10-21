/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
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

package com.clover.sdk.v3.apps;

@SuppressWarnings("all")
public final class AppSubscription implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
   * Unique identifier
  */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }
 /**
   * App subscription name
  */
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }
 /**
   * The cost of the subscription
  */
  public java.lang.Long getAmount() {
    return cacheGet(CacheKey.amount);
  }
 /**
   * App subscription name
  */
  public java.lang.String getDescription() {
    return cacheGet(CacheKey.description);
  }
 /**
   * App subscription active status
  */
  public java.lang.Boolean getActive() {
    return cacheGet(CacheKey.active);
  }
 /**
   * Reference to app this subscription belongs to
  */
  public com.clover.sdk.v3.base.Reference getApp() {
    return cacheGet(CacheKey.app);
  }
 /**
   * The list of merchants that have this app subscription installed
  */
  public java.util.List<com.clover.sdk.v3.base.Reference> getMerchants() {
    return cacheGet(CacheKey.merchants);
  }


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractName();
      }
    },
    amount {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractAmount();
      }
    },
    description {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractDescription();
      }
    },
    active {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractActive();
      }
    },
    app {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractApp();
      }
    },
    merchants {
      @Override
      public Object extractValue(AppSubscription instance) {
        return instance.extractMerchants();
      }
    },
    ;

    public abstract Object extractValue(AppSubscription instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public AppSubscription() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppSubscription(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppSubscription(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppSubscription(AppSubscription src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) { throw new IllegalArgumentException("Maximum string length exceeded for 'id'");}

    java.lang.String name = getName();
    if (name == null) throw new java.lang.IllegalArgumentException("'name' is required to be non-null");
    if (name != null && name.length() > 20) { throw new IllegalArgumentException("Maximum string length exceeded for 'name'");}

    java.lang.Long amount = getAmount();
    if (amount == null) throw new java.lang.IllegalArgumentException("'amount' is required to be non-null");
    if (amount != null && ( amount < 0)) throw new IllegalArgumentException("Invalid value for 'amount'");

    java.lang.String description = getDescription();
    if (description == null) throw new java.lang.IllegalArgumentException("'description' is required to be non-null");
    if (description != null && description.length() > 1024) { throw new IllegalArgumentException("Maximum string length exceeded for 'description'");}
  }



  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }


  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }


  private java.lang.Long extractAmount() {
    return getJSONObject().isNull("amount") ? null :
      getJSONObject().optLong("amount");
  }


  private java.lang.String extractDescription() {
    return getJSONObject().isNull("description") ? null :
      getJSONObject().optString("description");
  }


  private java.lang.Boolean extractActive() {
    return getJSONObject().isNull("active") ? null :
      getJSONObject().optBoolean("active");
  }


  private com.clover.sdk.v3.base.Reference extractApp() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("app");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("app"));
    }
    return null;
  }


  private java.util.List<com.clover.sdk.v3.base.Reference> extractMerchants() {
    if (getJSONObject().isNull("merchants")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("merchants");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.base.Reference> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.base.Reference>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.base.Reference item = new com.clover.sdk.v3.base.Reference(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'description' field is set and is not null */
  public boolean isNotNullDescription() {
    return cacheValueIsNotNull(CacheKey.description);
  }

  /** Checks whether the 'active' field is set and is not null */
  public boolean isNotNullActive() {
    return cacheValueIsNotNull(CacheKey.active);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'merchants' field is set and is not null */
  public boolean isNotNullMerchants() {
    return cacheValueIsNotNull(CacheKey.merchants);
  }

  /** Checks whether the 'merchants' field is set and is not null and is not empty */
  public boolean isNotEmptyMerchants() {
    return isNotNullMerchants() && !getMerchants().isEmpty();
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'description' field has been set, however the value could be null */
  public boolean hasDescription() {
    return cacheHasKey(CacheKey.description);
  }

  /** Checks whether the 'active' field has been set, however the value could be null */
  public boolean hasActive() {
    return cacheHasKey(CacheKey.active);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'merchants' field has been set, however the value could be null */
  public boolean hasMerchants() {
    return cacheHasKey(CacheKey.merchants);
  }


  /**
   * Sets the field 'id'.
   */
  public AppSubscription setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'name'.
   */
  public AppSubscription setName(java.lang.String name) {
    logChange("name");

    try {
      getJSONObject().put("name", name == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(name));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.name);
    return this;
  }

  /**
   * Sets the field 'amount'.
   */
  public AppSubscription setAmount(java.lang.Long amount) {
    logChange("amount");

    try {
      getJSONObject().put("amount", amount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(amount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.amount);
    return this;
  }

  /**
   * Sets the field 'description'.
   */
  public AppSubscription setDescription(java.lang.String description) {
    logChange("description");

    try {
      getJSONObject().put("description", description == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(description));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.description);
    return this;
  }

  /**
   * Sets the field 'active'.
   */
  public AppSubscription setActive(java.lang.Boolean active) {
    logChange("active");

    try {
      getJSONObject().put("active", active == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(active));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.active);
    return this;
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppSubscription setApp(com.clover.sdk.v3.base.Reference app) {
    logChange("app");

    try {
      getJSONObject().put("app",
          app == null ? org.json.JSONObject.NULL : app.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.app);
    return this;
  }

  /**
   * Sets the field 'merchants'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppSubscription setMerchants(java.util.List<com.clover.sdk.v3.base.Reference> merchants) {
    logChange("merchants");

    try {
      if (merchants == null) {
        getJSONObject().put("merchants", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.merchants);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.base.Reference obj : merchants) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("merchants", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.merchants);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    unlogChange("name");
    getJSONObject().remove("name");
    cacheRemoveValue(CacheKey.name);
  }

  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    unlogChange("amount");
    getJSONObject().remove("amount");
    cacheRemoveValue(CacheKey.amount);
  }

  /** Clears the 'description' field, the 'has' method for this field will now return false */
  public void clearDescription() {
    unlogChange("description");
    getJSONObject().remove("description");
    cacheRemoveValue(CacheKey.description);
  }

  /** Clears the 'active' field, the 'has' method for this field will now return false */
  public void clearActive() {
    unlogChange("active");
    getJSONObject().remove("active");
    cacheRemoveValue(CacheKey.active);
  }

  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    unlogChange("app");
    getJSONObject().remove("app");
    cacheRemoveValue(CacheKey.app);
  }

  /** Clears the 'merchants' field, the 'has' method for this field will now return false */
  public void clearMerchants() {
    unlogChange("merchants");
    getJSONObject().remove("merchants");
    cacheRemoveValue(CacheKey.merchants);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppSubscription copyChanges() {
    AppSubscription copy = new AppSubscription();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppSubscription src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new AppSubscription(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "AppSubscription{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<AppSubscription> CREATOR = new android.os.Parcelable.Creator<AppSubscription>() {
    @Override
    public AppSubscription createFromParcel(android.os.Parcel in) {
      AppSubscription instance = new AppSubscription(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public AppSubscription[] newArray(int size) {
      return new AppSubscription[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppSubscription> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppSubscription>() {
    @Override
    public AppSubscription create(org.json.JSONObject jsonObject) {
      return new AppSubscription(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 20;

    public static final boolean AMOUNT_IS_REQUIRED = true;
    public static final long AMOUNT_MIN = 0;

    public static final boolean DESCRIPTION_IS_REQUIRED = true;
    public static final long DESCRIPTION_MAX_LEN = 1024;

    public static final boolean ACTIVE_IS_REQUIRED = false;

    public static final boolean APP_IS_REQUIRED = false;

    public static final boolean MERCHANTS_IS_REQUIRED = false;

  }

}
