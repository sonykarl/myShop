package info.dropy.dropy.Shops.commons.data.Models.products

import java.util.*
import javax.persistence.*

@Entity
data class Discount (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    @Column(name = "discount_percent")
    val discount_percent: Float,
    @Column(name = "created_at")
    val created_at: String,
    @Column(name = "discount_code")
    val discountcode:String? = null,
    @Column(name = "modified_at")
    val modified_at: String? = null,
    @Column(name = "deleted_at")
    val deleted_at: String? = null
        )