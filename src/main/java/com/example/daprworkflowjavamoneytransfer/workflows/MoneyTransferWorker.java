package com.example.daprworkflowjavamoneytransfer.workflows;

import io.dapr.workflows.runtime.WorkflowRuntime;
import io.dapr.workflows.runtime.WorkflowRuntimeBuilder;
import com.example.daprworkflowjavamoneytransfer.workflows.activities.NotifyActivity;


public class MoneyTransferWorker {
  /**
   * The main method of this app.
   *
   * @param args The port the app will listen on.
   * @throws Exception An Exception.
   */
  public static void main(String[] args) throws Exception {
    // // Register the Workflow with the builder.
    // WorkflowRuntimeBuilder builder = new WorkflowRuntimeBuilder().registerWorkflow(MoneyTransferWorkflow.class);
    
    // // register workflow activities
    // builder.registerActivity(NotifyActivity.class);

    // // Build and then start the workflow runtime pulling and executing tasks
    // try (WorkflowRuntime runtime = builder.build()) {
    //   System.out.println("---\n\tStart workflow runtime\n---");
    //   runtime.start();
    // }
  }
}
