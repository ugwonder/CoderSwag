package com.mgbachi_ugo.coderswag.Model

import android.os.Parcel
import android.os.Parcelable

class UnitProduct constructor(var cat: String?, var title: String?, var price: String?, var image: String?) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(cat)
        parcel.writeString(title)
        parcel.writeString(price)
        parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UnitProduct> {
        override fun createFromParcel(parcel: Parcel): UnitProduct {
            return UnitProduct(parcel)
        }

        override fun newArray(size: Int): Array<UnitProduct?> {
            return arrayOfNulls(size)
        }
    }
}