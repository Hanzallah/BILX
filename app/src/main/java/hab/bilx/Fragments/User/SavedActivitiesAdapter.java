package hab.bilx.Fragments.User;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hab.bilx.R;

import java.util.List;

public class SavedActivitiesAdapter extends RecyclerView.Adapter<SavedActivitiesAdapter.MyViewHolder> {
    private List<SavedActivitiesObject> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView activityName,clubName, ge, time,date, location, language, description;

        public MyViewHolder(View view) {
            super(view);
            activityName = (TextView) view.findViewById(R.id.saved_activity_name_user);
            clubName = (TextView) view.findViewById(R.id.saved_club_name_user);
            ge = (TextView) view.findViewById(R.id.saved_ge_point_user);
            time = (TextView) view.findViewById(R.id.saved_time_user);
            date = (TextView) view.findViewById(R.id.saved_date_user);
            location = (TextView) view.findViewById(R.id.saved_location_user);
            language = (TextView) view.findViewById(R.id.saved_language_user);
            description = (TextView) view.findViewById(R.id.saved_description_user);
        }
    }


    public SavedActivitiesAdapter(List<SavedActivitiesObject> list) {
        this.list = list;
    }

    @Override
    public SavedActivitiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.saved_activities_list, parent, false);

        return new SavedActivitiesAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SavedActivitiesAdapter.MyViewHolder holder, int position) {

        SavedActivitiesObject s = list.get(position);
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