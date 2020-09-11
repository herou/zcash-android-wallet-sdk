package cash.z.ecc.android.sdk

import androidx.test.platform.app.InstrumentationRegistry
import cash.z.ecc.android.sdk.ext.TroubleshootingTwig
import cash.z.ecc.android.sdk.ext.Twig
import org.junit.Assert.assertEquals
import org.junit.Test

class VkInitializerTest {

    @Test
    fun testInit() {
        val height = 1_419_900


        val initializer = VkInitializer(context) {
            importedWalletBirthday(height)
            viewingKeys("zxviews1qvn6j50dqqqqpqxqkvqgx2sp63jccr4k5t8zefadpzsu0yy73vczfznwc794xz6lvy3yp5ucv43lww48zz95ey5vhrsq83dqh0ky9junq0cww2wjp9c3cd45n5l5x8l2g9atnx27e9jgyy8zasjy26gugjtefphan9al3tx208m8ekev5kkx3ug6pd0qk4gq4j4wfuxajn388pfpq54wklwktqkyjz9e6gam0n09xjc35ncd3yah5aa9ezj55lk4u7v7hn0v86vz7ygq4qj2v",
            "zxviews1qv886f6hqqqqpqy2ajg9sm22vs4gm4hhajthctfkfws34u45pjtut3qmz0eatpqzvllgsvlk3x0y35ktx5fnzqqzueyph20k3328kx46y3u5xs4750cwuwjuuccfp7la6rh8yt2vjz6tylsrwzy3khtjjzw7etkae6gw3vq608k7quka4nxkeqdxxsr9xxdagv2rhhwugs6w0cquu2ykgzgaln2vyv6ah3ram2h6lrpxuznyczt2xl3lyxcwlk4wfz5rh7wzfd7642c2ae5d7")
            alias = "VkInitTest2"
        }
        assertEquals(height, initializer.birthday.height)
    }

    companion object {
        private val context = InstrumentationRegistry.getInstrumentation().context
        init {
            Twig.plant(TroubleshootingTwig())
        }
    }
}