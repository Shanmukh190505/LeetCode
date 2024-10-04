import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    df=pd.Dataframe(student_data, columns = ["student_id","age"])
    return df