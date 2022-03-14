package example.fragmentstabbarttutorial
import androidx.fragment.app.Fragment
import  androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragmenttabbar2.CharFragment
import com.example.fragmenttabbar2.HomeFragment
import com.example.fragmenttabbar2.ListFragment

class TabPageAdapter(activity: FragmentActivity, private val tabCount: Int) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = tabCount {
        override fun createFragment(position: Int): Fragment {
            return  when (position)
            {
                0 -> HomeFragment()
                1 -> ListFragment()
                2 -> CharFragment()
                else -> HomeFragment()
            }
        }
    }
}