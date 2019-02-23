package com.notixia.whh.mytestapplication.retrofit2;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.notixia.whh.mytestapplication.R;

import java.util.ArrayList;

public class OperationQtyAdapter extends RecyclerView.Adapter<OperationQtyAdapter.NoticeViewHolder> {

    private QuantityMapPOJO dataList;

    public OperationQtyAdapter(QuantityMapPOJO dataList) {
        this.dataList = dataList;
    }

    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_view_row, parent, false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticeViewHolder holder, int position) {
        holder.txtNoticeTitle.setText(dataList.getQuantityMap().getJobOrderName());
        holder.txtNoticeBrief.setText(dataList.getQuantityMap().getOperationPCLinkIDName());
        holder.txtNoticeFilePath.setText(dataList.getQuantityMap().getJobOrderID());
    }

    @Override
    public int getItemCount() {
        return -1;
    }

    class NoticeViewHolder extends RecyclerView.ViewHolder {

        TextView txtNoticeTitle, txtNoticeBrief, txtNoticeFilePath;

        NoticeViewHolder(View itemView) {
            super(itemView);
            txtNoticeTitle =  itemView.findViewById(R.id.txt_notice_title);
            txtNoticeBrief =  itemView.findViewById(R.id.txt_notice_brief);
            txtNoticeFilePath =  itemView.findViewById(R.id.txt_notice_file_path);
        }
    }
}