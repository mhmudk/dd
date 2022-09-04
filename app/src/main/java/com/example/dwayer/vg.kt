package com.example.dwayer;

public class vg {

         pagger.addOnPageChangeListener(object)
            pagger.addOnPageChangeListener(new ViewPager.OnPageChangeListener()

    {
        @Override
        public void onPageScrolled ( int position, float positionOffset, int positionOffsetPixels){

    }

        @Override
        public void onPageSelected ( int position){

        if (position == 2) {
            next.setVisibility(View.VISIBLE);

        }
    }

        @Override
        public void onPageScrollStateChanged ( int state){

    }
    });
        pagger.setAdapter(new

    PagerAdapter() {
        @NonNull
        @Override
        public Object instantiateItem (@NonNull ViewGroup container,int position){
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View v = layoutInflater.inflate(layout[position], container, false);
            container.addView(v);
            return v;
        }

        @Override
        public int getCount () {
            return layout.length;
        }

        @Override
        public boolean isViewFromObject (@NonNull View view, @NonNull Object object){
            return view == object;
        }

        @Override
        public void destroyItem (@NonNull ViewGroup container,int position, @NonNull Object object){
            View v = (View) object;
            container.removeView(v);

        }
    });
        /*
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int current = pagger.getCurrentItem();
                if (current < layout.length - 1) {
                    pagger.setCurrentItem(current + 1);
                } else {
                    launchDashboard();
                }
            }
        });

         */
}
