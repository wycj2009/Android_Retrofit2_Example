package com.example.android_retrofit2_example

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/*
1. https://www.jsonschema2pojo.org 접속
2. Source type: JSON 선택
3. Annotation style: Gson 선택
4. POJO(Plain Old Java Object) Class 생성
 */

data class RandomUserAPIResponse(
        @SerializedName("results") @Expose val results: List<Result>? = null,
//        @SerializedName("info") @Expose val info: Info? = null
) {
    data class Result(
//            @SerializedName("gender") @Expose val gender: String? = null,
            @SerializedName("name") @Expose val name: Name? = null,
//            @SerializedName("location") @Expose val location: Location? = null,
//            @SerializedName("email") @Expose val email: String? = null,
//            @SerializedName("login") @Expose val login: Login? = null,
//            @SerializedName("dob") @Expose val dob: Dob? = null,
//            @SerializedName("registered") @Expose val registered: Registered? = null,
//            @SerializedName("phone") @Expose val phone: String? = null,
//            @SerializedName("cell") @Expose val cell: String? = null,
//            @SerializedName("id") @Expose val id: Id? = null,
            @SerializedName("picture") @Expose val picture: Picture? = null,
//            @SerializedName("nat") @Expose val nat: String? = null
    ) {
        data class Name(
                @SerializedName("title") @Expose val title: String? = null,
                @SerializedName("first") @Expose val first: String? = null,
                @SerializedName("last") @Expose val last: String? = null
        )

        data class Location(
                @SerializedName("street") @Expose val street: Street? = null,
                @SerializedName("city") @Expose val city: String? = null,
                @SerializedName("state") @Expose val state: String? = null,
                @SerializedName("country") @Expose val country: String? = null,
                @SerializedName("postcode") @Expose val postcode: Int? = null,
                @SerializedName("coordinates") @Expose val coordinates: Coordinates? = null,
                @SerializedName("timezone") @Expose val timezone: Timezone? = null
        ) {
            data class Street(
                    @SerializedName("number") @Expose val number: Int? = null,
                    @SerializedName("name") @Expose val name: String? = null
            )

            data class Coordinates(
                    @SerializedName("latitude") @Expose val latitude: String? = null,
                    @SerializedName("longitude") @Expose val longitude: String? = null
            )

            data class Timezone(
                    @SerializedName("offset") @Expose val offset: String? = null,
                    @SerializedName("description") @Expose val description: String? = null
            )
        }

        data class Login(
                @SerializedName("uuid") @Expose val uuid: String? = null,
                @SerializedName("username") @Expose val username: String? = null,
                @SerializedName("password") @Expose val password: String? = null,
                @SerializedName("salt") @Expose val salt: String? = null,
                @SerializedName("md5") @Expose val md5: String? = null,
                @SerializedName("sha1") @Expose val sha1: String? = null,
                @SerializedName("sha256") @Expose val sha256: String? = null
        )

        data class Dob(
                @SerializedName("date") @Expose val date: String? = null,
                @SerializedName("age") @Expose val age: Int? = null
        )

        data class Registered(
                @SerializedName("date") @Expose val date: String? = null,
                @SerializedName("age") @Expose val age: Int? = null
        )

        data class Id(
                @SerializedName("name") @Expose val name: String? = null,
                @SerializedName("value") @Expose val value: String? = null
        )

        data class Picture(
                @SerializedName("large") @Expose val large: String? = null,
                @SerializedName("medium") @Expose val medium: String? = null,
                @SerializedName("thumbnail") @Expose val thumbnail: String? = null
        )
    }

    data class Info(
            @SerializedName("seed") @Expose val seed: String? = null,
            @SerializedName("results") @Expose val results: Int? = null,
            @SerializedName("page") @Expose val page: Int? = null,
            @SerializedName("version") @Expose val version: String? = null
    )
}