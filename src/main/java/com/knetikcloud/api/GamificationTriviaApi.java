package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.AnswerResource;
import com.knetikcloud.model.ImportJobResource;
import com.knetikcloud.model.LongWrapper;
import com.knetikcloud.model.PageResourceAnswerResource;
import com.knetikcloud.model.PageResourceDeltaResource;
import com.knetikcloud.model.PageResourceImportJobResource;
import com.knetikcloud.model.PageResourceQuestionResource;
import com.knetikcloud.model.PageResourceQuestionTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.QuestionResource;
import com.knetikcloud.model.QuestionTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GamificationTriviaApi {
  /**
   * Add an answer to a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param questionId The id of the question (required)
   * @param answer The new answer (optional)
   * @return Call&lt;AnswerResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/questions/{question_id}/answers")
  Call<AnswerResource> addQuestionAnswers(
    @retrofit2.http.Path("question_id") String questionId, @retrofit2.http.Body AnswerResource answer
  );

  /**
   * Add a tag to a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @param tag The new tag (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/questions/{id}/tags")
  Call<Void> addQuestionTag(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body StringWrapper tag
  );

  /**
   * Add a tag to a batch of questions
   * All questions that dont&#39;t have the tag and match filters will have it added. The returned number is the number of questions updated. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param tag The tag to add (optional)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Call&lt;Integer&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/questions/tags")
  Call<Integer> addTagToQuestionsBatch(
    @retrofit2.http.Body StringWrapper tag, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_idset") String filterIdset, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_published") Boolean filterPublished, @retrofit2.http.Query("filter_import_id") Long filterImportId
  );

  /**
   * Create an import job
   * Set up a job to import a set of trivia questions from a cvs file at a remote url. the file will be validated asynchronously but will not be processed until started manually with the process endpoint. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param request The new import job (optional)
   * @return Call&lt;ImportJobResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/import")
  Call<ImportJobResource> createImportJob(
    @retrofit2.http.Body ImportJobResource request
  );

  /**
   * Create a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param question The new question (optional)
   * @return Call&lt;QuestionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/questions")
  Call<QuestionResource> createQuestion(
    @retrofit2.http.Body QuestionResource question
  );

  /**
   * Create a question template
   * Question templates define a type of question and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param questionTemplateResource The question template resource object (optional)
   * @return Call&lt;QuestionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/questions/templates")
  Call<QuestionTemplateResource> createQuestionTemplate(
    @retrofit2.http.Body QuestionTemplateResource questionTemplateResource
  );

  /**
   * Delete an import job
   * Also deletes all questions that were imported by it. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the job (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("trivia/import/{id}")
  Call<Void> deleteImportJob(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Delete a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("trivia/questions/{id}")
  Call<Void> deleteQuestion(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Remove an answer from a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("trivia/questions/{question_id}/answers/{id}")
  Call<Void> deleteQuestionAnswers(
    @retrofit2.http.Path("question_id") String questionId, @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a question template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("trivia/questions/templates/{id}")
  Call<Void> deleteQuestionTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get an import job
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the job (required)
   * @return Call&lt;ImportJobResource&gt;
   */
  @GET("trivia/import/{id}")
  Call<ImportJobResource> getImportJob(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Get a list of import job
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param filterVendor Filter for jobs by vendor id (optional)
   * @param filterCategory Filter for jobs by category id (optional)
   * @param filterName Filter for jobs which name *STARTS* with the given string (optional)
   * @param filterStatus Filter for jobs that are in a specific set of statuses (comma separated) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceImportJobResource&gt;
   */
  @GET("trivia/import")
  Call<PageResourceImportJobResource> getImportJobs(
    @retrofit2.http.Query("filter_vendor") String filterVendor, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_status") String filterStatus, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @return Call&lt;QuestionResource&gt;
   */
  @GET("trivia/questions/{id}")
  Call<QuestionResource> getQuestion(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get an answer for a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @return Call&lt;AnswerResource&gt;
   */
  @GET("trivia/questions/{question_id}/answers/{id}")
  Call<AnswerResource> getQuestionAnswer(
    @retrofit2.http.Path("question_id") String questionId, @retrofit2.http.Path("id") String id
  );

  /**
   * List the answers available for a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param questionId The id of the question (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceAnswerResource&gt;
   */
  @GET("trivia/questions/{question_id}/answers")
  Call<PageResourceAnswerResource> getQuestionAnswers(
    @retrofit2.http.Path("question_id") String questionId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * List question deltas in ascending order of updated date
   * The &#39;since&#39; parameter is important to avoid getting a full list of all questions. Implementors should make sure they pass the updated date of the last resource loaded, not the date of the last request, in order to avoid gaps. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param since Timestamp in seconds (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceDeltaResource&gt;
   */
  @GET("trivia/questions/delta")
  Call<PageResourceDeltaResource> getQuestionDeltas(
    @retrofit2.http.Query("since") Long since, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * List the tags for a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourcestring&gt;
   */
  @GET("trivia/questions/{id}/tags")
  Call<PageResourcestring> getQuestionTags(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get a single question template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or TRIVIA_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return Call&lt;QuestionTemplateResource&gt;
   */
  @GET("trivia/questions/templates/{id}")
  Call<QuestionTemplateResource> getQuestionTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search question templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or TRIVIA_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceQuestionTemplateResource&gt;
   */
  @GET("trivia/questions/templates")
  Call<PageResourceQuestionTemplateResource> getQuestionTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search questions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Call&lt;PageResourceQuestionResource&gt;
   */
  @GET("trivia/questions")
  Call<PageResourceQuestionResource> getQuestions(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_idset") String filterIdset, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_published") Boolean filterPublished, @retrofit2.http.Query("filter_import_id") Long filterImportId
  );

  /**
   * Count questions based on filters
   * This is also provided by the list endpoint so you don&#39;t need to call this for pagination purposes. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @return Call&lt;LongWrapper&gt;
   */
  @GET("trivia/questions/count")
  Call<LongWrapper> getQuestionsCount(
    @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_idset") String filterIdset, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_published") Boolean filterPublished
  );

  /**
   * Start processing an import job
   * Will process the CSV file and add new questions asynchronously. The status of the job must be &#39;VALID&#39;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the job (required)
   * @param publishNow Whether the new questions should be published live immediately (required)
   * @return Call&lt;ImportJobResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("trivia/import/{id}/process")
  Call<ImportJobResource> processImportJob(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Query("publish_now") Boolean publishNow
  );

  /**
   * Remove a tag from a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @param tag The tag to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("trivia/questions/{id}/tags/{tag}")
  Call<Void> removeQuestionTag(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("tag") String tag
  );

  /**
   * Remove a tag from a batch of questions
   * ll questions that have the tag and match filters will have it removed. The returned number is the number of questions updated. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param tag The tag to remove (required)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTag Filter for questions with specified tag (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Call&lt;Integer&gt;
   */
  @DELETE("trivia/questions/tags/{tag}")
  Call<Integer> removeTagToQuestionsBatch(
    @retrofit2.http.Path("tag") String tag, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_idset") String filterIdset, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_published") Boolean filterPublished, @retrofit2.http.Query("filter_import_id") Long filterImportId
  );

  /**
   * List and search tags by the beginning of the string
   * For performance reasons, search &amp; category filters are mutually exclusive. If category is specified, search filter will be ignored in order to do fast matches for typeahead. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param filterSearch Filter for tags starting with the given text (optional)
   * @param filterCategory Filter for tags on questions from a specific category (optional)
   * @param filterImportId Filter for tags on questions from a specific import job (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourcestring&gt;
   */
  @GET("trivia/tags")
  Call<PageResourcestring> searchQuestionTags(
    @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_import_id") Long filterImportId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Update an import job
   * Changes should be made before process is started for there to be any effect. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the job (required)
   * @param request The updated job (optional)
   * @return Call&lt;ImportJobResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("trivia/import/{id}")
  Call<ImportJobResource> updateImportJob(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body ImportJobResource request
  );

  /**
   * Update a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param id The id of the question (required)
   * @param question The updated question (optional)
   * @return Call&lt;QuestionResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("trivia/questions/{id}")
  Call<QuestionResource> updateQuestion(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body QuestionResource question
  );

  /**
   * Update an answer for a question
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param questionId The id of the question (required)
   * @param id The id of the answer (required)
   * @param answer The updated answer (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("trivia/questions/{question_id}/answers/{id}")
  Call<Void> updateQuestionAnswer(
    @retrofit2.http.Path("question_id") String questionId, @retrofit2.http.Path("id") String id, @retrofit2.http.Body AnswerResource answer
  );

  /**
   * Update a question template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;QuestionTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("trivia/questions/templates/{id}")
  Call<QuestionTemplateResource> updateQuestionTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

  /**
   * Bulk update questions
   * Will update all questions that match filters used (or all questions in system if no filters used). Body should match a question resource with only those properties you wish to set. Null values will be ignored. Returned number is how many were updated. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TRIVIA_ADMIN
   * @param question New values for a set of question fields (optional)
   * @param filterSearch Filter for documents whose question, answers or tags contains provided string (optional)
   * @param filterIdset Filter for documents whose id is in the comma separated list provided (optional)
   * @param filterCategory Filter for questions with specified category, by id (optional)
   * @param filterTagset Filter for questions with specified tags (separated by comma) (optional)
   * @param filterType Filter for questions with specified type.  Allowable values: (&#39;TEXT&#39;, &#39;IMAGE&#39;, &#39;VIDEO&#39;, &#39;AUDIO&#39;) (optional)
   * @param filterPublished Filter for questions currenctly published or not (optional)
   * @param filterImportId Filter for questions from a specific import job (optional)
   * @return Call&lt;Integer&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("trivia/questions")
  Call<Integer> updateQuestionsInBulk(
    @retrofit2.http.Body QuestionResource question, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("filter_idset") String filterIdset, @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_tagset") String filterTagset, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_published") Boolean filterPublished, @retrofit2.http.Query("filter_import_id") Long filterImportId
  );

}
