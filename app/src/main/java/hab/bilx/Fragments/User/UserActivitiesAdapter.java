package hab.bilx.Fragments.User;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hab.bilx.R;

import java.util.List;

public class UserActivitiesAdapter extends RecyclerView.Adapter<UserActivitiesAdapter.MyViewHolder> {
    private List<UserActivitiesObject> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView activityName, clubName, ge, time,date, location, language, description;

        public MyViewHolder(View view) {
            super(view);
            activityName = (TextView) view.findViewById(R.id.activity_name_user);
            clubName = (TextView)view.findViewById(R.id.club_name_user);
            ge = (TextView) view.findViewById(R.id.ge_point_user);
            time = (TextView) view.findViewById(R.id.time_user);
            date = (TextView) view.findViewById(R.id.date_user);
            location = (TextView) view.findViewById(R.id.location_user);
            language = (TextView) view.findViewById(R.id.language_user);
            description = (TextView) view.findViewById(R.id.description_user);
        }
    }


    public UserActivitiesAdapter(List<UserActivitiesObject> list) {
        this.list = list;
    }

    @Override
    public UserActivitiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_activities_list, parent, false);

        return new UserActivitiesAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserActivitiesAdapter.MyViewHolder holder, int position) {

        UserActivitiesObject s = list.get(position);
        holder.activityName.setText(s.getActivityName());
        holder.clubName.setText(s.getClubName());
        holder.ge.setText(s.getGe());
        holder.time.setText(s.getTime());
        holder.date.setText(s.getDate());
        holder.location.setText(s.getLocation());
        holder.language.setText(s.getLanguage());
        holder.description.setText(s.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void removeAdapter(int i){
        list.remove(i);
    }
}